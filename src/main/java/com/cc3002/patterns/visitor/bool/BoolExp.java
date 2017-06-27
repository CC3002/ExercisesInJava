package com.cc3002.patterns.visitor.bool;

import com.cc3002.patterns.visitor.visitor.Visitor;

public interface BoolExp {
	public boolean getValue();
	public void accept(Visitor v);
}
