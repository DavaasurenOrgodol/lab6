package edu.miu.cs.cs489.lesson6.citylibraryapp;

import edu.miu.cs.cs489.lesson6.citylibraryapp.model.Address;
import edu.miu.cs.cs489.lesson6.citylibraryapp.model.Appointment;
import edu.miu.cs.cs489.lesson6.citylibraryapp.model.Dentist;
import edu.miu.cs.cs489.lesson6.citylibraryapp.model.Patient;
import edu.miu.cs.cs489.lesson6.citylibraryapp.model.Surgery;
import edu.miu.cs.cs489.lesson6.citylibraryapp.service.AddressService;
import edu.miu.cs.cs489.lesson6.citylibraryapp.service.AppointmentService;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CitylibrarycliappApplication implements CommandLineRunner {

    private final AppointmentService appointmentService;
    private final AddressService addressService;

    public CitylibrarycliappApplication(AppointmentService appointmentService,
            AddressService addressService) {
        this.appointmentService = appointmentService;
        this.addressService = addressService;
    }

    public static void main(String[] args) {
        SpringApplication.run(CitylibrarycliappApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Address address = new Address(1L, "123 Main St", "Springfield", "IL", "62704");
        addressService.addNewAddress(address);
        // Assume these are fetched or created earlier
        Dentist dentist = new Dentist("Dr.", " Smith");
        Surgery surgery = new Surgery("Downtown Dental", address);
        Patient patient = new Patient("John Doe", "johndoe@example.com");

        // Set appointment time
        LocalDateTime appointmentTime = LocalDateTime.of(2025, 5, 10, 14, 30);

        // Create appointment
        Appointment appointment = new Appointment();
        appointment.setDentist(dentist);
        appointment.setSurgery(surgery);
        appointment.setPatient(patient);
        appointment.setAppDateTime(appointmentTime);
        appointmentService.addNewAppointment(appointment);

    }
}
