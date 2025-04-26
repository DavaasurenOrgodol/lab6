package edu.miu.cs.cs489.lesson6.citylibraryapp.service.impl;

import org.springframework.stereotype.Service;

import edu.miu.cs.cs489.lesson6.citylibraryapp.model.Dentist;
import edu.miu.cs.cs489.lesson6.citylibraryapp.repository.DentistRepository;
import edu.miu.cs.cs489.lesson6.citylibraryapp.service.DentistService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DentistServiceImpl implements DentistService {
    private DentistRepository dentistRepository;

    @Override
    public Dentist addNewDentist(Dentist newDentist) {
        // TODO Auto-generated method stub
        Dentist savedDentist = dentistRepository.save(newDentist);
        return savedDentist;
    }

}
