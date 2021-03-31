//
//  ProfileView.swift
//  Corona_test
//
//  Created by Петрос Тепоян on 3/29/21.
//

import UIKit

class ProfileView: UIView {

	
	private lazy var vStack: UIStackView = {
		let v = UIStackView()
		v.alignment = .center
		v.axis = .vertical
		v.distribution = .equalSpacing
		v.spacing = 5
		return v
	}()
	
	init() {
		super.init(frame: CGRect.init())
		addSubview(vStack)
		vStack.translatesAutoresizingMaskIntoConstraints = false
		NSLayoutConstraint.activate([
			vStack.widthAnchor.constraint(equalTo: widthAnchor),
			vStack.heightAnchor.constraint(equalTo: heightAnchor),
			vStack.centerYAnchor.constraint(equalTo: centerYAnchor),
			vStack.centerXAnchor.constraint(equalTo: centerXAnchor)
		])
		
		let image = UIImage(named: "ProfilePicture")
		
		let imageView = UIImageView(image: image)
		imageView.contentMode = .scaleAspectFit
		
		let fullNameLabel = UILabel()
		fullNameLabel.font = UIFont.boldSystemFont(ofSize: 21)
		fullNameLabel.text = "User name and surname"
		
		let testDateLabel = UILabel()
		testDateLabel.font = UIFont.systemFont(ofSize: 13)
		testDateLabel.text = "Test date: 12.12.22"
		
		let companyNameLabel = UILabel()
		
		// https://stackoverflow.com/questions/36486761/make-part-of-a-uilabel-bold-in-swift
		let normalText = "Test done by "
		let normalString = NSMutableAttributedString(string: normalText)
		
		let boldText = "Company Name"
		let attrs = [NSAttributedString.Key.font : UIFont.boldSystemFont(ofSize: 15)]
		let attributedString = NSMutableAttributedString(string:boldText, attributes:attrs)
		
		normalString.append(attributedString)
		
		companyNameLabel.attributedText = normalString
		
		vStack.addArrangedSubview(imageView)
		vStack.addArrangedSubview(fullNameLabel)
		vStack.addArrangedSubview(testDateLabel)
		vStack.addArrangedSubview(companyNameLabel)
		
//		imageView.translatesAutoresizingMaskIntoConstraints = false
//		NSLayoutConstraint.activate([
//			imageView.widthAnchor.constraint(equalTo: imageView.heightAnchor)
//		])
		
	}
	
	required init?(coder: NSCoder) {
		fatalError("init(coder:) has not been implemented")
	}
	
}
