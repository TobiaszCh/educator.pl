package com.educator.mapper;

import com.educator.domain.Course;
import com.educator.domain.dto.CourseDto;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseMapper {

    public CourseDto mapToDtoCourse(Course course) {
        return new CourseDto (
                course.getId(),
                course.getDisplayName());
    }

    public List<CourseDto> mapToListDtoCourse(List<Course> course) {
        return course.stream().map(this::mapToDtoCourse).collect(Collectors.toList());
    }
}
