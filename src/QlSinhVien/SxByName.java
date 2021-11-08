package QlSinhVien;

import java.util.Comparator;

public class SxByName implements Comparator<student> {

    @Override
    public int compare(student o1, student o2) {
        // TODO Auto-generated method stub

        //tang dan:p1 compare p2
        //giam dan: p2 compare p1
        //=0 equal = true
        return o1.getName().compareTo(o2.getName());
    }
    
}
