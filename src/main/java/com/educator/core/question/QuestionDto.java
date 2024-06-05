package com.educator.core.question;
import com.educator.core.answer.AnswerDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.List;

@Getter
@AllArgsConstructor
public class QuestionDto {

    private Long id;

    private String displayName;

    private Long subjectId;

    private List<AnswerDto> answers;

}
