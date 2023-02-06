package CourseWork.Task;

// ежемесячная задача

import CourseWork.EnumTask.RepeatabilityTask;
import CourseWork.EnumTask.Type;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MonthlyTask extends Task {
    public MonthlyTask(Type type , String title , String descriptions , RepeatabilityTask repeatabilityTask) {
        super ( type , title , descriptions , repeatabilityTask );
    }

    public MonthlyTask(Type type , String title , String descriptions , LocalDateTime dateLead , RepeatabilityTask repeatabilityTask) {
        super ( type , title , descriptions , dateLead , repeatabilityTask );
    }

    @Override
    public boolean appearsIn(LocalDate date) {
        return getDateLead ().toLocalDate ().getDayOfMonth () == date.getDayOfMonth ();
    }

}