package com.software.company.service;

import com.software.company.model.Team;
import com.software.company.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    public Optional<Team> getTeamById(Long id) {
        return teamRepository.findById(id);
    }

    public Team createTeam(Team team) {
        return teamRepository.save(team);
    }

    public Team updateTeam(Long id, Team updatedTeam) {
        if (teamRepository.existsById(id)) {
            updatedTeam.setId(id);
            return teamRepository.save(updatedTeam);
        }
        return null; // Handle not found case
    }

    public void deleteTeam(Long id) {
        teamRepository.deleteById(id);
    }
}
