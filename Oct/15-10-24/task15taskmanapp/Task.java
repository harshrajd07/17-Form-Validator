package com.task15taskmanapp;

public class Task {
private String title;
private String description;
private String priority;
public Task(String title, String description, String priority) {
	super();
	if(title.length()==0){
		System.out.println("------------1");
		System.out.println("invalid title");
		System.out.println("Fill in the variables properly");
		System.exit(1);
	}
	else if(description.length()==0) {
		System.out.println("--------------------------2");
		System.out.println("invalid description");
		System.out.println("Fill the description variables properly.");
		System.exit(1);
	}
	else {
	this.title = title;
	this.description = description;
	this.priority = priority;
	}
}
 public String getTitle() {
	return title;
}
public String getDescription(){
	return description;
}
public String getPriority() {
	return priority;
}

public void marksAsCompleted() {
	boolean task=isCompleted();
	if(task)
	{
		
	}
	else {
		//toString();
		System.out.println("Title ="+title);
		System.out.println("description ="+description);
		System.out.println("priority ="+priority);
		System.out.println("is completed ="+task);
	}
}
public boolean isCompleted()
{
	  boolean result=true;
	  if(this.title.length()>0 && this.priority.length()>0 && this.description.length()>0) {
	if(this.priority.equalsIgnoreCase("high"))
	{
		result=false;
	}
	  }
	  else {
		   System.err.println("Fix the varaible first");
	  }
	  return result;
}

@Override
public String toString() {
	return "Task [title=" + title + ", description=" + description + ", priority=" + priority + "]";
}


}
