package db.Labels.astTypeLabels;

import org.neo4j.graphdb.Label;

public class ClassLabel implements Label {
	@Override
	public String name() {
		return "AST_TYPE_CLASS";
	}
}