package com.cc3002.patterns.filesystem;

public class File implements IFile{

	private String filename;
	
	public File(String filename){
		this.filename=filename;
	}
	
	@Override
	public void mkdir(String name) {}

	@Override
	public void touch(String filename) {}

	@Override
	public IFile find(String name) {
		if(name.equals(filename)) return this;
		return null;
	}

	@Override
	public void rmr(String name) {
		if(name.equals(filename)) delete();
	}

	@Override
	public void delete() {
		filename = null;
	}

}
