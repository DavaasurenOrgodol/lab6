package edu.miu.cs.cs489.lesson6.citylibraryapp.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import edu.miu.cs.cs489.lesson6.citylibraryapp.dto.request.PatientRequestDto;
import edu.miu.cs.cs489.lesson6.citylibraryapp.dto.response.PatientResponseDto;
import edu.miu.cs.cs489.lesson6.citylibraryapp.model.Patient;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PatientMapper {

    Patient patientRequestDtoToPatient(PatientRequestDto patientRequestDto);

    PatientResponseDto patientToPatientResponseDto(Patient Patient);

    List<PatientResponseDto> patientToPatientResponseDtoList(List<Patient> Patients);

}
