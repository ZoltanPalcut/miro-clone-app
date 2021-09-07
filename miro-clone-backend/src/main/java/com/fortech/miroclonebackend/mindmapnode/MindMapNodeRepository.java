package com.fortech.miroclonebackend.mindmapnode;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface MindMapNodeRepository extends Neo4jRepository<MindMapNode, Long> {
    MindMapNode findByName(String name);
}
