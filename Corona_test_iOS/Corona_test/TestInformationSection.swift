//
//  TestInformationSection.swift
//  Corona_test
//
//  Created by Петрос Тепоян on 3/29/21.
//

import UIKit

class TestInformationSection: UIView {

	private var titleLabel = UILabel()
	private lazy var vStack: UIStackView = {
		let s = UIStackView()
		s.axis = .vertical
		s.alignment = .leading
		s.distribution = .equalSpacing
		s.spacing = 30
		return s
	}()
	
	private let parameter = InformationBlock(title: "Parameter", value: "nCov-2019 RNA detection (RT PCR)")
	private let sample = InformationBlock(title: "Sample", value: "Nasopharyngeal swab")
	private let result = InformationBlock(title: "Result", value: "Negative", isTestResult: true)
	
	init() {
		super.init(frame: CGRect.init())
		
		titleLabel.text = "Test information"
		titleLabel.font = UIFont.preferredFont(forTextStyle: .title3).bold()
		
		self.addSubview(vStack)
		vStack.translatesAutoresizingMaskIntoConstraints = false
		NSLayoutConstraint.activate([
			vStack.leadingAnchor.constraint(equalTo: leadingAnchor),
			vStack.trailingAnchor.constraint(equalTo: trailingAnchor),
			vStack.heightAnchor.constraint(equalTo: heightAnchor),
		])
		
		
		vStack.addArrangedSubview(titleLabel)
		vStack.addArrangedSubview(parameter)
		vStack.addArrangedSubview(sample)
		vStack.addArrangedSubview(result)
		
		result.translatesAutoresizingMaskIntoConstraints = false
		result.trailingAnchor.constraint(equalTo: trailingAnchor).isActive = true
	}
	
	
	required init?(coder: NSCoder) {
		fatalError("init(coder:) has not been implemented")
	}
	
}
