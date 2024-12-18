package idusw.jw202312403.blog.repository;

import idusw.jw202312403.blog.model.Blogger;

import java.util.List;

public class BloggerDAOImpl extends DAOImpl implements BloggerDAO {

    @Override
    public int create(Blogger blogger) {
        return 0;
    }

    @Override
    public Blogger read(Blogger blogger) {
        return null;
    }

    @Override
    public List<Blogger> readList() {
        return List.of();
    }

    @Override
    public int update(Blogger blogger) {
        return 0;
    }

    @Override
    public int delete(Blogger blogger) {
        return 0;
    }
}
