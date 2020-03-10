package io.quarkus.deployment.steps;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.HotDeploymentWatchedFileBuildItem;

class DevModeBuildStep {

    @BuildStep
    List<HotDeploymentWatchedFileBuildItem> config() {
        return Arrays.asList(new HotDeploymentWatchedFileBuildItem("META-INF/microprofile-config.properties"),
                new HotDeploymentWatchedFileBuildItem("application.properties"), new HotDeploymentWatchedFileBuildItem(
                        Paths.get(".env").toAbsolutePath().toAbsolutePath().toString()));
    }
}
