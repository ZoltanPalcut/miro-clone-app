package com.fortech.miroclonebackend;

import com.fortech.miroclonebackend.mindmapnode.MindMapNode;
import com.fortech.miroclonebackend.mindmapnode.MindMapNodeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

import java.util.Set;

@SpringBootApplication
@EnableNeo4jRepositories
@Slf4j
public class MiroCloneBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiroCloneBackendApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner (MindMapNodeRepository mindMapNodeRepository) {
        return args -> {
            log.info("Starting application!");

            mindMapNodeRepository.deleteAll();

            var node1 = new MindMapNode("node1");
            var node2 = new MindMapNode("node2");
            var node3 = new MindMapNode("node3");
            var node4 = new MindMapNode("node4");
            var node5 = new MindMapNode("node5");
            var node6 = new MindMapNode("node6");
            var node7 = new MindMapNode("node7");
            var node8 = new MindMapNode("node8");
            var node9 = new MindMapNode("node9");

            node1.pointsTo(node2);
            node1.pointsTo(node3);
            node1.pointsTo(node4);
            node2.pointsTo(node5);
            node2.pointsTo(node6);
            node3.pointsTo(node7);
            node3.pointsTo(node8);
            node3.pointsTo(node9);

            mindMapNodeRepository.save(node1);
            mindMapNodeRepository.save(node2);
            mindMapNodeRepository.save(node3);
            mindMapNodeRepository.save(node4);
            mindMapNodeRepository.save(node5);
            mindMapNodeRepository.save(node6);
            mindMapNodeRepository.save(node7);
            mindMapNodeRepository.save(node8);
            mindMapNodeRepository.save(node9);

            log.info("Finished saving in repo!");

        };
    }

}
