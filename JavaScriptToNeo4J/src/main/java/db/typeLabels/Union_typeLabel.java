package db.typeLabels;

import org.neo4j.graphdb.Label;

public class Union_typeLabel implements Label {
	@Override
	public String name() {
		return "AST_TYPE_UNION_TYPE";
	}
}