/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productivityTracker;

/**
 *
 * @author yashmundada
 */
public class Notes {
    String titleOfNote;
    String description;
    String courseId;
  
    Notes(String titleOfNote, String description, String courseId) {
      this.titleOfNote = titleOfNote;
      this.description = description;
      this.courseId = courseId;
    }
  
    // public void printNote(Notes note) {
    //   System.out.println(note.titleOfNote);
    //   System.out.println(note.description);
    // }
  }
