package com.services;

import com.entities.JeuxVideo;
import com.interfaces.Repository;
import org.hibernate.query.Query;

import java.util.List;

public class JeuxVideoService  extends BaseService implements Repository<JeuxVideo> {

        public JeuxVideoService(){
            super();
        }

        @Override
        public boolean create(JeuxVideo o) {
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(o);
            session.getTransaction().commit();
            session.close();
            return true;
        }

        @Override
        public boolean update(JeuxVideo o) {
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.update(o);
            session.getTransaction().commit();
            session.close();
            return true;
        }

        @Override
        public boolean delete(JeuxVideo o) {
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.delete(o);
            session.getTransaction().commit();
            session.close();
            return true;
        }

        @Override
        public JeuxVideo findById(int id) {
            JeuxVideo jeuxVideo = null;
            session = sessionFactory.openSession();
            jeuxVideo = (JeuxVideo) session.get(JeuxVideo.class, id);
            session.close();
            return jeuxVideo;
        }

        @Override
        public List<JeuxVideo> findAll() {
            List<JeuxVideo> jeuxVideoList = null;
            session = sessionFactory.openSession();
            Query<JeuxVideo> jeuxVideoQuery = session.createQuery("from JeuxVideo ");
            jeuxVideoList = jeuxVideoQuery.list();
            session.close();
            return jeuxVideoList;
        }

}
