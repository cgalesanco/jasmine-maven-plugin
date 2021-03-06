package com.github.searls.jasmine.config;

import java.io.File;
import java.util.List;

import org.apache.maven.plugin.logging.Log;

import com.github.searls.jasmine.model.ScriptSearch;
import com.github.searls.jasmine.runner.SpecRunnerTemplate;

public interface JasmineConfiguration {
  File getBasedir();
  File getJasmineTargetDir();

  String getSrcDirectoryName();
  String getSpecDirectoryName();
  String getLibDirectoryName();

  ScriptSearch getSources();
  ScriptSearch getSpecs();
  File getLibsDirectory();

  List<String> getPreloadSources();

  String getSourceEncoding();

  Log getLog();

  SpecRunnerTemplate getSpecRunnerTemplate();

  File getCustomRunnerTemplate();
  File getCustomRunnerConfiguration();

  String getScriptLoaderPath();
}
