package db.typeLabels;

import org.neo4j.graphdb.Label;

public class Assign_divLabel implements Label {
	@Override
	public String name() {
		return "AST_TYPE_ASSIGN_DIV";
	}
}