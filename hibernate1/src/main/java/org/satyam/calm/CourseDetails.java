package org.satyam.calm;
import javax.persistence.*;

@Entity
@Table(name = "CourseDetails")
public class CourseDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "details_id")
    private Long id;

    @Column(name = "description")
    private String description;

    @OneToOne
    @JoinColumn(name = "course_id")
    private Course course;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}