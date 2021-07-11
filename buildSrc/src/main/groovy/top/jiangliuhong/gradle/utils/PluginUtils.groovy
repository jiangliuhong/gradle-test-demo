package top.jiangliuhong.gradle.utils

import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.api.tasks.SourceSet
import org.gradle.api.tasks.SourceSetContainer

class PluginUtils {

    static SourceSet getMainSourceSet(Project project) {
        SourceSetContainer sourceSets = (SourceSetContainer) project.getExtensions().getByName("sourceSets")
        return sourceSets.getByName("main")
    }

    static Set<Task> getAllBuildTasks(Project project) {
        return project.getTasksByName("build", true)
    }
}
