package edu.miu.cs.cs489.lesson6.citylibraryapp.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import edu.miu.cs.cs489.lesson6.citylibraryapp.config.JwtService;
import edu.miu.cs.cs489.lesson6.citylibraryapp.dto.request.AuthenticationRequest;
import edu.miu.cs.cs489.lesson6.citylibraryapp.dto.request.RegisterRequest;
import edu.miu.cs.cs489.lesson6.citylibraryapp.dto.response.AuthenticationResponse;
import edu.miu.cs.cs489.lesson6.citylibraryapp.repository.UserRepository;
import edu.miu.cs.cs489.lesson6.citylibraryapp.user.User;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final UserRepository userRepository;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;

    public AuthenticationResponse authenticate(AuthenticationRequest authenticationRequest) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        authenticationRequest.username(),
                        authenticationRequest.password()));
        // generate token for the user
        var user = (User) authentication.getPrincipal();
        String token = jwtService.generateToken(user);
        return new AuthenticationResponse(token);
    }

    public AuthenticationResponse register(RegisterRequest registerRequest) {
        User user = new User(
                registerRequest.firstName(),
                registerRequest.lastName(),
                registerRequest.username(),
                passwordEncoder.encode(registerRequest.password()),
                registerRequest.role());
        User registeredUser = userRepository.save(user);
        // Generate token for this user
        String token = jwtService.generateToken(registeredUser);
        return new AuthenticationResponse(token);
    }
}
