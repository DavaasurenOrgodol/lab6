package edu.miu.cs.cs489.lesson6.citylibraryapp.service;

import java.util.List;

import edu.miu.cs.cs489.lesson6.citylibraryapp.model.Appointment;

public interface AppointmentService {

    List<Appointment> getAllAppointments();

    Appointment addNewAppointment(Appointment newAppointment);

    Appointment getAppointmentId(Integer AppointmentId);

    Appointment updateAppointment(Appointment editedPublished);

    void deleteAppointmentById(Integer AppointmentId);

    List<Appointment> getAppointmentByNameStart(String nameStart);

}
