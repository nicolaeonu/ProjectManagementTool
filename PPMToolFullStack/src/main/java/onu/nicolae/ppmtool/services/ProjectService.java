package onu.nicolae.ppmtool.services;

import onu.nicolae.ppmtool.domain.Project;
import onu.nicolae.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository prejectRepository;

    public Project saveOrUpdateProject(Project project){
        return prejectRepository.save(project);
    }

}
