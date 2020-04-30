package com.cg.lab2.trainee.service;

import java.util.List;

import com.cg.lab2.trainee.entity.Trainee;

public interface TraineeServiceInterface {

	Trainee savetrainee(Trainee trainee);

	List<Trainee> reterivetrainee();

	Trainee findbyid(int traineeid);

	void deletetrainee(int traineeid);

	Trainee modifytrainee(int traineeid);

}
