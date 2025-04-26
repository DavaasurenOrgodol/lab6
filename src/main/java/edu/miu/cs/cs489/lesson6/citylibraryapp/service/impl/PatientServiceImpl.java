package edu.miu.cs.cs489.lesson6.citylibraryapp.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import edu.miu.cs.cs489.lesson6.citylibraryapp.dto.request.PatientRequestDto;
import edu.miu.cs.cs489.lesson6.citylibraryapp.dto.response.PatientResponseDto;
import edu.miu.cs.cs489.lesson6.citylibraryapp.mapper.PatientMapper;
import edu.miu.cs.cs489.lesson6.citylibraryapp.model.Patient;
import edu.miu.cs.cs489.lesson6.citylibraryapp.repository.PatientRepository;
import edu.miu.cs.cs489.lesson6.citylibraryapp.service.PatientService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {
    private PatientRepository patientRepository;
    private PatientMapper patientMapper;

    @Override
    public PatientResponseDto createPatient(PatientRequestDto newPatient) {
        // TODO Auto-generated method stub
        Patient savedPatient = patientRepository.save(patientMapper.patientRequestDtoToPatient(newPatient));
        return patientMapper.patientToPatientResponseDto(savedPatient);
    }

    @Override
    public List<PatientResponseDto> findAllPatients() {
        // TODO Auto-generated method stub
        List<Patient> patients = patientRepository.findAll();
        return patientMapper.patientToPatientResponseDtoList(patients);
    }

    @Override
    public PatientResponseDto findPatientById(Long id) {
        // TODO Auto-generated method stub
        Optional<Patient> foundPatient = patientRepository.findById(id);
        if (foundPatient.isPresent())
            return patientMapper.patientToPatientResponseDto(foundPatient.get());
        return null;
    }

    @Override
    public void deletePatient(Long id) {
        // TODO Auto-generated method stub
        patientRepository.deleteById(id);
    }

    @Override
    public PatientResponseDto updatePatient(Long id, PatientRequestDto patientRequestDto) {
        // TODO Auto-generated method stub
        Optional<Patient> foundPatient = patientRepository.findById(id);
        if (foundPatient.isPresent()) {
            Patient existingPatient = foundPatient.get();
            Patient mappedPatient = patientMapper.patientRequestDtoToPatient(patientRequestDto);
            mappedPatient.setId(existingPatient.getId());
            Patient updatedPatient = patientRepository.save(mappedPatient);
            return patientMapper.patientToPatientResponseDto(updatedPatient);
        }

        return null;

    }

}
