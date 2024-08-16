package ya.lms.job.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CoursesTable")
public class Courses {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Course-Id")
	private String courseId;
	@Column(name = "Course-Name")
	private String courseName;
	@Column(name = "Course-Desc")
	private String courseDescription;
	@Column(name = "Course-Code")
	private String courseCode;
	@Column(name = "Instructor-Id")
	private String instructorId;
	@Column(name = "CreatedAT")
	private Date createdAt;
	@Column(name = "UpdatedAT")
	private Date updatedAt;
}
