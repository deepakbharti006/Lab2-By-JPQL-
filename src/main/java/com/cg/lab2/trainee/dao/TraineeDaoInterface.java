package com.cg.lab2.trainee.dao;

import java.util.List;

import com.cg.lab2.trainee.entity.Trainee;

public interface TraineeDaoInterface {

	boolean addtrainee(Trainee trainee);

	List<Trainee> reterivetrainee();

	Trainee findbyid(int traineeid);

	void deletetrainee(int traineeid);

//	public Trainee modifytrainee(Trainee traineeid);
	Trainee modifytrainee(int traineeId);

}
