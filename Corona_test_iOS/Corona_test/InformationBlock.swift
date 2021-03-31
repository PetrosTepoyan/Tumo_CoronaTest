//
//  InformationBlock.swift
//  Corona_test
//
//  Created by Петрос Тепоян on 3/29/21.
//

import UIKit

class InformationBlock: UIView {

	var title: String!
	var value: String!
	
	private let titleLabel = UILabel()
	private let valueLabel = UILabel()
	private lazy var vStack: UIStackView = {
		let s = UIStackView()
		s.axis = .vertical
		s.alignment = .leading
		s.spacing = 5
		return s
	}()
	
	init(title: String, value: String, isTestResult: Bool = false) {
		self.title = title
		self.value = value
		
		titleLabel.text = title
		titleLabel.font = UIFont.preferredFont(forTextStyle: .callout).bold()
		titleLabel.textAlignment = .left
		
		valueLabel.text = value
		valueLabel.font = UIFont.systemFont(ofSize: 20)
		valueLabel.textAlignment = .left
		
		super.init(frame: CGRect.init())
		
		self.addSubview(vStack)
		vStack.translatesAutoresizingMaskIntoConstraints = false
		NSLayoutConstraint.activate([
			vStack.widthAnchor.constraint(equalTo: widthAnchor),
			vStack.heightAnchor.constraint(equalTo: heightAnchor),
			vStack.centerYAnchor.constraint(equalTo: centerYAnchor),
			vStack.centerXAnchor.constraint(equalTo: centerXAnchor)
		])
		vStack.addArrangedSubview(titleLabel)
		vStack.addArrangedSubview(valueLabel)
		
		if isTestResult {
			valueLabel.text = value.uppercased()
			valueLabel.backgroundColor = UIColor.green.withAlphaComponent(0.2)
			valueLabel.textAlignment = .center
			valueLabel.translatesAutoresizingMaskIntoConstraints = false
			valueLabel.trailingAnchor.constraint(equalTo: trailingAnchor).isActive = true
			valueLabel.heightAnchor.constraint(equalToConstant: 30).isActive = true
		}
		
	}
	
	required init?(coder: NSCoder) {
		fatalError("init(coder:) has not been implemented")
	}
	
	
	
}

// https://spin.atomicobject.com/2018/02/02/swift-scaled-font-bold-italic/
extension UIFont {
	func withTraits(traits:UIFontDescriptor.SymbolicTraits) -> UIFont {
		let descriptor = fontDescriptor.withSymbolicTraits(traits)
		return UIFont(descriptor: descriptor!, size: 0) //size 0 means keep the size as it is
	}
	
	func bold() -> UIFont {
		return withTraits(traits: .traitBold)
	}
	
	func italic() -> UIFont {
		return withTraits(traits: .traitItalic)
	}
}
