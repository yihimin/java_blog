package idusw.jw202312403.blog.repository;
import idusw.jw202312403.blog.model.Blogger;

import java.util.List;

public interface BloggerDAO {
    /* 데이터 처리의 기본 연산 : C.R.U.D (Create, Read, Update, Delete) */
    int create(Blogger blogger);            // create one object / record
    Blogger read(Blogger blogger);          // read one object / record
    List<Blogger> readList();               // read objects / records
    int update(Blogger blogger);            // update one object / record
    int delete(Blogger blogger);            // delete one object / record
}