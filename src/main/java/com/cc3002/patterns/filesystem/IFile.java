package com.cc3002.patterns.filesystem;

public interface IFile {
	public void mkdir(String name);
	public void touch(String filename);
	public IFile find(String name);
	public void rmr(String name);
	void delete();
}
