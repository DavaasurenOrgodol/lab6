package edu.miu.cs.cs489.lesson6.citylibraryapp.service.impl;

import org.springframework.stereotype.Service;

import edu.miu.cs.cs489.lesson6.citylibraryapp.model.Patient;
import edu.miu.cs.cs489.lesson6.citylibraryapp.repository.PatientRepository;
import edu.miu.cs.cs489.lesson6.citylibraryapp.service.PatientService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {
    private PatientRepository patientRepository;

    @Override
    public Patient addNewPatient(Patient newPatient) {
        // TODO Auto-generated method stub
        Patient savedPatient = patientRepository.save(newPatient);
        return savedPatient;
    }

}
