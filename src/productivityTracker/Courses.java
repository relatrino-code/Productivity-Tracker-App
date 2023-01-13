/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productivityTracker;

/**
 *
 * @author yashmundada
 */
import java.util.*;

public class Courses {
  Scanner sc = new Scanner(System.in);
  // variable declaration
  private String courseId;
  // courseId refers to CSF111 eg
  private String instructorName;
  // instructorName refers to "Amit Dua"
  private String grade;
    // creating constructor
//  Course(String courseId, String instructorName) {
//    this.courseId=courseId;
//    this.instructorName = instructorName;
//  }
  // grade refers to A/B/C/ etc which will be enumed
  ArrayList<Notes> notesList = new ArrayList<Notes>();
  Notes notes;
  // array of notes for this course - incorrect ; should be creating an array list
  // for variable no of notes per class
  // end of variable declaration

  // start of getters and setters
  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }

  public String getInstructorName() {
    return instructorName;
  }

  public void setInstructorName(String instructorName) {
    this.instructorName = instructorName;
  }

  public String getCourseId() {
    return courseId;
  }

  public void setCourseId(String courseId) {
    this.courseId = courseId;
  }
  /// end of getters and setters

  public Notes addNote() {
    System.out.println("Please enter the title of this note");
    String titleOfNote = sc.nextLine();
    System.out.println("Please enter the description of this note");
    String description = sc.nextLine();
    Notes newNote = new Notes(titleOfNote, description, this.courseId);
    notesList.add(newNote);
    return newNote;
  }

  public void viewNotes() {
    for (Notes notes : notesList) {
      // System.out.println(printNote());
      // printNote(notes);
      // System.out.println(note);
      System.out.println(notes.titleOfNote);
      System.out.println(notes.description);
    }
  }

}

