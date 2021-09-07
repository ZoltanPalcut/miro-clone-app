package com.fortech.miroclonebackend.mindmapnode;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.HashSet;
import java.util.Set;

@Node
@ToString
public class MindMapNode {

    public MindMapNode(String name){
        this.name = name;
    }
    @Id
    @GeneratedValue
    private Long id;

    private final String name;

    @Relationship(type = "POINTS_TO")
    private Set<MindMapNode> pointsToNodes;

    public void pointsTo(MindMapNode mindmapnode) {
        if (pointsToNodes == null) {
            pointsToNodes = new HashSet<>();
        }
        pointsToNodes.add(mindmapnode);
    }
}
