package com.ignaciopiquerez.sofkachallange.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ignaciopiquerez.sofkachallange.config.HibernateConfig;
import com.ignaciopiquerez.sofkachallange.model.Player;

public class PlayerDao {
	public void savePlayer(Player player) {
		Transaction transaction = null;
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.save(player);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public List<Player> getPlayers() {
		try (Session session = HibernateConfig.getSessionFactory().openSession()) {
			return session.createQuery("from Player", Player.class).list();
		}
	}
}
