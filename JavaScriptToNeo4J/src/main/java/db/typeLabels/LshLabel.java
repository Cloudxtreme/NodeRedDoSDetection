package db.typeLabels;

import org.neo4j.graphdb.Label;

public class LshLabel implements Label {
	@Override
	public String name() {
		return "AST_TYPE_LSH";
	}
}