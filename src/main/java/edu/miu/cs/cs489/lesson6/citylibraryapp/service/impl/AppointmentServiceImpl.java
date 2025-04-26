package edu.miu.cs.cs489.lesson6.citylibraryapp.service.impl;

import edu.miu.cs.cs489.lesson6.citylibraryapp.model.Appointment;
import edu.miu.cs.cs489.lesson6.citylibraryapp.repository.AppointmentRepository;
import edu.miu.cs.cs489.lesson6.citylibraryapp.service.AppointmentService;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AppointmentServiceImpl implements AppointmentService {
    private AppointmentRepository appointmentRepository;

    @Override
    public List<Appointment> getAllAppointments() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllAppointments'");
    }

    @Override
    public Appointment addNewAppointment(Appointment newAppointment) {
        // TODO Auto-generated method stub
        Appointment savedAppointment = appointmentRepository.save(newAppointment);
        return savedAppointment;
    }

    @Override
    public Appointment getAppointmentId(Integer AppointmentId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAppointmentId'");
    }

    @Override
    public Appointment updateAppointment(Appointment editedPublished) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateAppointment'");
    }

    @Override
    public void deleteAppointmentById(Integer AppointmentId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAppointmentById'");
    }

    @Override
    public List<Appointment> getAppointmentByNameStart(String nameStart) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAppointmentByNameStart'");
    }

}
