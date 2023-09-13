package org.time.gpo.cielo.extractenvvarsfromyaml.service;

import org.eclipse.jgit.api.errors.GitAPIException;
import org.time.gpo.cielo.extractenvvarsfromyaml.properties.PropertiesProcess;

import java.io.IOException;
import java.util.List;

public interface ProcessService {

    List<String> execute(PropertiesProcess properties) throws IOException, GitAPIException, InterruptedException;

}
