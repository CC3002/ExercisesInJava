package com.cc3002.patterns.visitor.visitor;

import com.cc3002.patterns.visitor.bool.AndExp;
import com.cc3002.patterns.visitor.bool.Literal;
import com.cc3002.patterns.visitor.bool.OrExp;

public interface Visitor {
	public void visitLiteral(Literal l);
	public void visitAnd(AndExp and);
	public void visitOr(OrExp or);
}
