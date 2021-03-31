//
//  UserInformationSection.swift
//  Corona_test
//
//  Created by Петрос Тепоян on 3/29/21.
//

import UIKit

class UserInformationSection: UIView {

	private var titleLabel = UILabel()
	private lazy var vStack: UIStackView = {
		let s = UIStackView()
		s.axis = .vertical
		s.alignment = .leading
		s.distribution = .equalSpacing
		s.spacing = 30
		return s
	}()
	
	private let passport = InformationBlock(title: "Passport", value: "12345612")
	private let birthday = InformationBlock(title: "Date of birthday", value: "12/12/99")
	private let phone = InformationBlock(title: "Phone", value: "(099) 12-23-12")
	
	init() {
		super.init(frame: CGRect.init())
		
		titleLabel.text = "User information"
		titleLabel.font = UIFont.preferredFont(forTextStyle: .title3).bold()
		
		self.addSubview(vStack)
		vStack.translatesAutoresizingMaskIntoConstraints = false
		NSLayoutConstraint.activate([
			vStack.widthAnchor.constraint(equalTo: widthAnchor),
			vStack.heightAnchor.constraint(equalTo: heightAnchor),
			vStack.centerYAnchor.constraint(equalTo: centerYAnchor),
			vStack.centerXAnchor.constraint(equalTo: centerXAnchor)
		])
		
		let hStack = UIStackView()
		
		hStack.axis = .horizontal
		hStack.distribution = .equalSpacing
		
		vStack.addArrangedSubview(titleLabel)
		vStack.addArrangedSubview(hStack)
		vStack.addArrangedSubview(phone)
		
		hStack.translatesAutoresizingMaskIntoConstraints = false
		NSLayoutConstraint.activate([
			hStack.trailingAnchor.constraint(equalTo: trailingAnchor)
		])
		hStack.addArrangedSubview(passport)
		hStack.addArrangedSubview(birthday)
		
	}
	
	
	required init?(coder: NSCoder) {
		fatalError("init(coder:) has not been implemented")
	}
	
}
