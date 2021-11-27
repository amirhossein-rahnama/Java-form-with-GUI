
package dentistclinic;

import java.io.Serializable;

public class Operation implements Serializable{
  private int op_id;  // (PK)
  private int opt_id; // (FK) --> OperationType.opt_id
  private int apt_id; // (FK) --> Appointment.apt_id
  private int recs_id; // (FK) --> Receipt.recs_id

    public Operation(int op_id, int opt_id, int apt_id, int recs_id) {
        this.op_id = op_id;
        this.opt_id = opt_id;
        this.apt_id = apt_id;
        this.recs_id = recs_id;
    }

    public int getOp_id() {
        return op_id;
    }

    public void setOp_id(int op_id) {
        this.op_id = op_id;
    }

    public int getOpt_id() {
        return opt_id;
    }

    public void setOpt_id(int opt_id) {
        this.opt_id = opt_id;
    }

    public int getApt_id() {
        return apt_id;
    }

    public void setApt_id(int apt_id) {
        this.apt_id = apt_id;
    }

    public int getRecs_id() {
        return recs_id;
    }

    public void setRecs_id(int recs_id) {
        this.recs_id = recs_id;
    }
  
}
