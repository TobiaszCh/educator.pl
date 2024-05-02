package com.educator.level;
import com.educator.subject.SubjectRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;
@Component
@AllArgsConstructor
public class LevelMapper {

    private final SubjectRepository subjectRepository;

    public LevelDto mapToDtoLevel(Level level) {
        return new LevelDto(level.getId(),
                level.getSubject() != null ? level.getSubject().getId(): null);
    }

    public Level mapToLevel(LevelDto levelDto) {
        return new Level(levelDto.getId(),
                subjectRepository.getById(levelDto.getSubjectId()));
    }

    public List<LevelDto> mapToListDtoLevel(List<Level> levels) {
        return levels.stream().map(this::mapToDtoLevel).collect(Collectors.toList());
    }
}
