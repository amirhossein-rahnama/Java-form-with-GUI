
package finalprojectjava;

import java.io.Serializable;

/**
 *
 * @author Asus
 */
public class satisfaction implements Serializable {
    private String status;
    private String satisfaction_code;
    private String feedback;
    private String point;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSatisfaction_code() {
        return satisfaction_code;
    }

    public void setSatisfaction_code(String satisfaction_code) {
        this.satisfaction_code = satisfaction_code;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public satisfaction(String status, String satisfaction_code, String feedback, String point) {
        this.status = status;
        this.satisfaction_code = satisfaction_code;
        this.feedback = feedback;
        this.point = point;
    }
}
