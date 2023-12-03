package com.software.company.controller;

import com.software.company.model.Role;
import com.software.company.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/roles")
public class RoleController {
    private final RoleService roleService;

    @Autowired
    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping
    public List<Role> getAllRoles() {
        return roleService.getAllRoles();
    }

    @GetMapping("/{roleId}")
    public Optional<Role> getRoleById(@PathVariable Long roleId) {
        return roleService.getRoleById(roleId);
    }

    @PostMapping
    public Role saveRole(@RequestBody Role role) {
        return roleService.saveRole(role);
    }

    @DeleteMapping("/{roleId}")
    public void deleteRole(@PathVariable Long roleId) {
        roleService.deleteRole(roleId);
    }
}
