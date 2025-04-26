package edu.miu.cs.cs489.lesson6.citylibraryapp.secured;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    @GetMapping
    public String getMember() {
        return "Member: secured end point";
    }

    @GetMapping("/admin-write")
    @PreAuthorize("hasAuthority('admin:write')")
    public String memberOnlyForAdminWrite() {
        return "Member: secured end point only for admin write";
    }
}
