package com.software.company.controller;

import com.software.company.model.Team;
import com.software.company.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/teams")
public class TeamController {

    @Autowired
    private TeamService teamService;

    // Get all teams
    @GetMapping
    public List<Team> getAllTeams() {
        return teamService.getAllTeams();
    }

    // Get team by ID
    @GetMapping("/{id}")
    public Optional<Team> getTeamById(@PathVariable Long id) {
        return teamService.getTeamById(id);
    }

    // Create a new team
    @PostMapping
    public Team createTeam(@RequestBody Team team) {
        return teamService.createTeam(team);
    }

    // Update an existing team
    @PutMapping("/{id}")
    public Team updateTeam(@PathVariable Long id, @RequestBody Team team) {
        return teamService.updateTeam(id, team);
    }

    // Delete a team by ID
    @DeleteMapping("/{id}")
    public void deleteTeam(@PathVariable Long id) {
        teamService.deleteTeam(id);
    }
}

