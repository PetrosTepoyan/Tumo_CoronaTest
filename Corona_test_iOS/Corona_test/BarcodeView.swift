//
//  BarcodeView.swift
//  Corona_test
//
//  Created by Петрос Тепоян on 3/29/21.
//

import UIKit

class BarcodeView: UIView {

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
		
		let image = UIImage(named: "Barcode")
		let imageView = UIImageView(image: image)
		imageView.contentMode = .scaleAspectFit
		
		let topLabel = UILabel()
		topLabel.text = "Scan QR code to see the result in the site of"
		topLabel.font = UIFont.systemFont(ofSize: 15)
		
		let bottomLabel = UILabel()
		bottomLabel.text = "National eHealth Operator"
		bottomLabel.font = UIFont.boldSystemFont(ofSize: 15)
		
		vStack.addArrangedSubview(imageView)
		vStack.addArrangedSubview(topLabel)
		vStack.addArrangedSubview(bottomLabel)
	}
	
	required init?(coder: NSCoder) {
		fatalError("init(coder:) has not been implemented")
	}
	
}
