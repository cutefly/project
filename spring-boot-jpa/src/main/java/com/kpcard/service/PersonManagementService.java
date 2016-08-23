/**
 * 
 */
package com.kpcard.service;

import java.util.List;

import com.kpcard.jpa.person.Person;
import com.kpcard.jpa.person.PersonSummary;

/**
 * 회원 관리 서비스
 * @author happymoney
 *
 */
public interface PersonManagementService {
	
	/**
	 * 회원정보 생성하기
	 * @param person 생성할 회원정보
	 * @return 생성된 회원정보
	 */
	public Person createPerson(Person person);
	
	/**
	 * 회원정보 삭제하기
	 * @param personId 회원 아이디
	 * @return 삭제 성공여부
	 */
	public boolean deletePerson(String personId);
	
	/**
	 * 회원정보 조건 검색
	 * @param first 시작번호
	 * @param maximum 최대개수
	 * @param sortKey 정렬키
	 * @param ascending 정렬순서
	 * @return 회원 요약정보 리스트
	 */
	public List<PersonSummary> queryPeopleByCriteria(
			int first,
			int maximum,
			String sortKey,
			boolean ascending);

	/**
	 * 전자우편주소로 회원 찾기
	 * @param email 전자우편주소
	 * @return 회원 요약정보 리스트
	 */
	public List<PersonSummary> queryPeopleByEmailAddress(String email);
	
	/**
	 * 전화번호로 회원 찾기
	 * @param phone 전화번호
	 * @return 회원 요약정보 리스트
	 */
	public List<PersonSummary> queryPeopleByPhoneNumber(String phone);
	
	/**
	 * 회원정보 가져오기
	 * @param personId 회원 아이디
	 * @return 회원정보
	 */
	public Person readPerson(String personId);
	
	/**
	 * 회원정보 수정하기
	 * @param personId 회원 아이디
	 * @param person 수정할 회원정보
	 * @return 수정된 회원정보
	 */
	public Person updatePerson(String personId, Person person);

}
