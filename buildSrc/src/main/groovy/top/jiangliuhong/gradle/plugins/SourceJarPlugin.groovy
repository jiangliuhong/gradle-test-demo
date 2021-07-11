package top.jiangliuhong.gradle.plugins

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.JavaPlugin
import org.gradle.jvm.tasks.Jar
import top.jiangliuhong.gradle.constants.TaskConstants
import top.jiangliuhong.gradle.utils.PluginUtils

class SourceJarPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        if (project.plugins.hasPlugin(JavaPlugin)) {
            project.tasks.register(TaskConstants.SOURCE_JAR, Jar, {
                group = TaskConstants.GROUP_NAME
                archiveClassifier.set("source")
                archiveClassifier = "source"
                archiveBaseName = project.name
                from PluginUtils.getMainSourceSet(project).allSource
            })
        }
    }
}
