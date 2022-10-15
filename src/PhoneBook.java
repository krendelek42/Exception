import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    List<Record> record;

    public PhoneBook (List<Record> record) {
        this.record = record;
    }
    public void createRecord(Record record) throws PhoneNumberAlreadyExists {
        int n = 0;
        for (Record record1 : this.record) {
            if (record1.phoneNumber.equals(record.phoneNumber)) {
                n += 1;
            }
        }
        if (n == 0) {
            this.record.add(record);
        } else {
            throw new PhoneNumberAlreadyExists("Номер уже существует");
        }


    }
    public List<Record> getAllRecords() {
        return record;

    }

    public void updateRecord(Record record) throws RecordNotFound, RecordNotValid {
        int newID = 0;
        int i = 0;
        for (Record record1 : this.record) {
            if (record.id == record1.id) {
                if (record.name.equals("") || record.phoneNumber.equals("")){
                    throw new RecordNotValid("Нет имени или номера");
                } else {
                    newID += 1;
                    this.record.set(i, record);
                }

            }
            i++;
        }
            if (newID == 0) {
                throw new RecordNotFound("Не существует такого id");
            }

    }
    public void deleteRecord(long id) throws RecordNotFound {
        int newID = 0;
        for (Record record1 : this.record) {
            if (record1.id == id) {
                newID += 1;
                this.record.remove(record1);
            }
        }
        if (newID == 0) {
            throw new RecordNotFound("Не существует такого id");
        }
    }
}