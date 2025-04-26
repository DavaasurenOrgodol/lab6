package edu.miu.cs.cs489.lesson6.citylibraryapp.service;

import java.util.List;

import edu.miu.cs.cs489.lesson6.citylibraryapp.dto.request.PatientRequestDto;
import edu.miu.cs.cs489.lesson6.citylibraryapp.dto.response.PatientResponseDto;

public interface PatientService {
    List<PatientResponseDto> findAllPatients();

    PatientResponseDto findPatientById(Long id);

    void deletePatient(Long id);

    PatientResponseDto updatePatient(Long id, PatientRequestDto patientRequestDto);

    PatientResponseDto createPatient(PatientRequestDto patientRequestDto);
}
